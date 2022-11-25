package guru.springframework.converters;

import guru.springframework.entities.User;
import guru.springframework.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/* note
   Usercomand id created from jaxb so you need it packaged
   so  that this interface has access to it
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
