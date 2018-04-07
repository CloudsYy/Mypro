package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;

//����spring������ʵ������һ��bean����ʱ��ʼ����ʱ�����ʵ����ͻᱻ
//���뵽spring�����Ļ�����
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	// ��ʵ����ʵ����UserServiceImpl�ӿڣ��������Ϊ�˴���һЩ�߼�ҵ��Ȼ��������ݿ��
	// Ȼ��������ݿ⣬��ʵ���ǵ���dao

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	//ͨ��springע�룬��ν�userMapperע�뵽UserServiceImpl���أ�����ʹ�����µ�ע�⣬����
	//Ȼ����ʱUserServiceImpl��û�зŵ�spring�����Ļ���֮��
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
