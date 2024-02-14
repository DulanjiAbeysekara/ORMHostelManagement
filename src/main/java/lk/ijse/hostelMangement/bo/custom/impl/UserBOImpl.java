package lk.ijse.hostelMangement.bo.custom.impl;

import lk.ijse.hostelMangement.bo.custom.UserBO;
import lk.ijse.hostelMangement.dao.DAOFactory;
import lk.ijse.hostelMangement.dao.custom.UserDAO;
import org.hibernate.Session;

public class UserBOImpl implements UserBO {
        private Session session;
        UserDAO userDAO=(UserDAO) DAOFactory.getDaoFactory.getDAO(DAOFactory.DAOTypes.USER);
}
