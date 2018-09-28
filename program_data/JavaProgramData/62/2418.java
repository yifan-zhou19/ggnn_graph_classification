package <missing>;

public class GlobalMembers
{
	/*Liloy Iris 2012.11.9*/
	public static int Main()
	{
		char c; //????c
		cin.get(c); //??c
		while (c != '\n') //?c??????,????
		{
			if (c != ' ') //?c?????,??c
			{
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
				while (c == ' ') //???????
				{
					cin.get(c);
				}
				System.out.print(c);
			}
			cin.get(c);
		}
		return 0;
	}
}
