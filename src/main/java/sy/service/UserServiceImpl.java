package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;

//告诉spring上下文实现类是一个bean，此时开始运行时，这个实现类就会被
//加入到spring上下文环境中
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	// 在实现类实现了UserServiceImpl接口，这个类是为了处理一些逻辑业务，然后调用数据库的
	// 然后调用数据库，其实就是调用dao

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	//通过spring注入，如何将userMapper注入到UserServiceImpl中呢？可以使用以下的注解，即可
	//然而此时UserServiceImpl并没有放到spring上下文环境之中
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
