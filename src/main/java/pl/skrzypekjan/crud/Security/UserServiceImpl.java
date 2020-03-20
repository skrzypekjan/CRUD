package pl.skrzypekjan.crud.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.skrzypekjan.crud.Dao.Entity.CurrentUser;
import pl.skrzypekjan.crud.Dao.Entity.Role;
import pl.skrzypekjan.crud.Dao.Entity.User;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    @Override
    public void updateUser(CurrentUser customUser, User user) {

    }

//    @Override
//    public void updateUser(CurrentUser customUser, @Valid User user) {
//        User userToUpdate = userRepository.getOne(customUser.getUser().getId());
//        userToUpdate.setFirstName(user.getFirstName());
//        userToUpdate.setLastName(user.getLastName());
//        userToUpdate.setPhoneNumber(user.getPhoneNumber());
//        userToUpdate.setEmail(user.getEmail());
//        userToUpdate.setVideoLink(user.getVideoLink());
//        userToUpdate.setFacebookLink(user.getFacebookLink());
//        userToUpdate.setUsername(user.getUsername());
//        userToUpdate.setPassword(user.getPassword());
//        userRepository.save(userToUpdate);
//    }
}