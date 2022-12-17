package dao;


import java.util.List;
import java.util.Map;

import domain.User;

/**
 * �û�������DAO
 */
public interface UserDao {


    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);
    
    void registUser(User user);

    void delete(int id);

    User findById(int i);

    void update(User user);

    /**
     * ��ѯ�ܼ�¼��
     * @return
     * @param condition
     */
    int findTotalCount(Map<String, String[]> condition);

    /**
     * ��ҳ��ѯÿҳ��¼
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}

