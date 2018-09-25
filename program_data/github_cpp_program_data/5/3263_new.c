#include <iostream>
//#include "../RandomNumberGeneratorImpl.h"
//#include "../KnapsackGenerator.h"
#include "../View.h"
#include "../Controller.h"
#include "../main.h"
using namespace std;
/*
int main() {
      RandomNumberGeneratorImpl gen(rand, srand); 
      KnapsackGenerator knapsack(gen);
      View view;
       Controller controller(view, knapsack);

    controller.go();

    cout << "DONE!!!!!!" << endl;
}
*/



int main()
{
	int A[15] = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	Print_Board(A);
	Peg_Menu(A);
	
	return 0;
}


