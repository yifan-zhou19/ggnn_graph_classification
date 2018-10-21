int PlaceApple = new int(int,int);
int main()
{
	int Apple;
	int Plate;
	int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (t-- != 0)
	{
		Apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(PlaceApple(Apple,Plate));
		System.out.print("\n");
	}
}
int PlaceApple(int AppleNumber, int PlateNumber)

{
	if (AppleNumber < 0 || PlateNumber == 0)
	{
		return 0;
	}
	if (AppleNumber == 1 || AppleNumber == 0 || PlateNumber == 1)
	{
		return 1;
	}
	int sum = 0;
	for (int i = 0; i <= AppleNumber / PlateNumber; i++)
	{
		sum += PlaceApple(AppleNumber - PlateNumber * i, PlateNumber - 1);
	}
	return sum;
}

