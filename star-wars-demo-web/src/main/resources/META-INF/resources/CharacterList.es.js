import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './CharacterList.soy';
import {Config} from 'metal-state';

class CharacterList extends Component {
  showCards() {
		this.displayStyle = 'cards';
	}

	showList() {
		this.displayStyle = 'list';
	}
}

CharacterList.STATE = {
  displayStyle: Config.oneOf(['cards', 'list']).value('cards')
};

// Register component
Soy.register(CharacterList, templates);

export default CharacterList;