package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int w;
	int i;
	int W;
	int day = 13;
	w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= 11;i++) //??i+1????????
	{
	  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
	  {
	  day = day + 31;
	  }
	  else if (i == 2)
	  {
	  day = day + 28;
	  }
	  else if (i == 0)
	  {
	  day = day + 0;
	  }
	  else
	  {
	  day = day + 30; //?????i+1?????
	  }
	  W = (w + ((day - 1) % 7)) % 7; //??i+1??13?????
	  if (W == 5)
	  {
	  System.out.print(i + 1);
	  System.out.print('\n');
	  }
	}
	return 0;
	}
}

