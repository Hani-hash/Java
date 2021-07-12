class ninja{
    constructor(name, health, speed, strength){
        this.name = name;
        this.health = 0;
        this.speed = 3; 
        this.strength = 3; 

    }
    sayName(){
        console.log(this.name);
    }

    showStats(){
        console.log(this.health, this.speed, this.strength);

    }

    dirnkSake(){
        this.health +=10; 

    }
}
const ninja1 = new ninja("Hyabusa");
ninja1.dirnkSake();
ninja1.sayName();
ninja1.showStats();

class Sensei extends ninja {
    constructor (wisdom){
        super(wisdom);
        this.wisdon = 10;
    }
    speakWisdom(){
        console.log("What one programmer can do in one month, two programmers can do in two months.");
    }
    drinkSake(){

    }
}

const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();

superSensei.showStats();