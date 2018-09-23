//============================================================================
// Name        : 7.6.cpp
// Author      : Zhang Yu
// Version     :
// Copyright   : Your copyright notice
// Description : ???
//============================================================================

int findknot = new int(float,float);
int findknot(float x,float y)
{
	if (x == y) //??x,y???????
	{
		return (int)x; //x????
	}
	if (Math.ceil(Math.log((double)x) / Math.log(2)) == Math.ceil(Math.log((double)y) / Math.log(2))) //??x,y????
	{
		return findknot(Math.floor(x / 2),Math.floor(y / 2)); //?????
	}
	else //??x,y?????
	{
		float tempmax = Math.max(x,y);
		float tempmin = Math.min(x,y);
		x = tempmax;
		y = tempmin;
		//??????x???????
		return findknot(Math.floor(x / 2),y); //x??????y??
	}
}
int main()
{
	int inputx;
	int inputy;
	inputx = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	inputy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(findknot((float)inputx,(float)inputy));
	return 0;
}

