import { IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle } from '@ionic/react';
import './ExploreContainer.css';

interface ContainerProps {
  nombreA: string;
  nombreB: string;
  nombreC: string;
  msa: string;
  msb: string;
  msc: string;
  name: string; 
}

const ExploreContainer: React.FC<ContainerProps> = ({ name ,nombreA, nombreB,nombreC, msa, msb, msc}) => {
  return (
    <div className="container">
      <strong>{name}</strong>
      <IonCard color={'success'}>
        <IonCardHeader>
          <IonCardTitle>{nombreA}</IonCardTitle>
          <IonCardSubtitle>{msa}</IonCardSubtitle>
        </IonCardHeader>
        <IonCardContent>Here's a small text description for the card content. Nothing more, nothing less.</IonCardContent>
      </IonCard>

      <IonCard color={'danger'}>
        <IonCardHeader>
          <IonCardTitle>{nombreB}</IonCardTitle>
          <IonCardSubtitle>{msb}</IonCardSubtitle>
        </IonCardHeader>

        <IonCardContent>Here's a small text description for the card content. Nothing more, nothing less.</IonCardContent>
      </IonCard>

      <IonCard color={'warning'}>
        <IonCardHeader>
          <IonCardTitle>{nombreC}</IonCardTitle>
          <IonCardSubtitle>{msc}</IonCardSubtitle>
        </IonCardHeader>

        <IonCardContent>Here's a small text description for the card content. Nothing more, nothing less.</IonCardContent>
      </IonCard>
    </div>
  );
};

export default ExploreContainer;
