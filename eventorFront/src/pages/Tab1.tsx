import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';
import './Tab1.css';

const Tab1: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Eventos</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <IonHeader collapse="condense">
          <IonToolbar>
            <IonTitle size="large">Eventos</IonTitle>
          </IonToolbar>
        </IonHeader>
        <ExploreContainer name="Eventos para todos los gustos" nombreA="Evento Fiesta" msa='Un evento de fiesta' nombreB="Evento B" msb='Un evento b' nombreC="EventoC" msc='un evento c'/>
      </IonContent>
    </IonPage>
  );
};

export default Tab1;
