import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './CharacterList.soy';

class CharacterList extends Component {}

// Register component
Soy.register(CharacterList, templates);

export default CharacterList;