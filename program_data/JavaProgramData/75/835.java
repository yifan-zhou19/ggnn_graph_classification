package <missing>;

public class GlobalMembers
{
	/*
	2010 12 22 ??
	?????
	????
	????2???2????????? 
	?1????i???????xi?????????? 
	?1????i??????????yi??????????? 
	??? 
	2,5,4,6,7,3,1,6,2 
	5,6,7,7,8,4,3,9,4 
	
	???9????????????? 
	[2,5),[5,6),[4,7),[6,7),[7,8),[3,4),[1,3),[6,9),[2,4)
	?? 1000012760
	*/


	public static int Main()
	{
		int[] T = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i = 0;
		int n = 0;
		int k = 0;
		int MostPeople = 0;
		int People = 0;
		char test;
		while (true)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			test = System.in.read();
			People++;
			i++;
			if (test == '\n')
			{
				break;
			}
		}
		i = 0;
		while (true)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			test = System.in.read();
			i++;
			if (test == '\n')
			{
				break;
			}
		}

		for (i = 0; i < People; i++)
		{
			k = 0;
			while (k < (y[i] - x[i]))
			{
				T[x[i] + k]++;
				k++;
			}
		}

		for (i = 0; i < 1000; i++)
		{
			if (T[i] > MostPeople)
			{
					MostPeople = T[i];
			}
		}

		System.out.print(People);
		System.out.print(' ');
		System.out.print(MostPeople);
		System.out.print("\n");

		return 0;
	}
}

