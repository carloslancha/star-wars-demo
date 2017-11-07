import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './ViewCharacter.soy';

class ViewCharacter extends Component {
}

// Register component
Soy.register(ViewCharacter, templates);

export default ViewCharacter;