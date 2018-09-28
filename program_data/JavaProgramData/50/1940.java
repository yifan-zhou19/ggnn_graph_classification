package <missing>;

public class GlobalMembers
{
	//********************************
	//*????1.cpp                ** 
	//*????????             **
	//*?????? 1200012834      **
	//*???2012.11.9              **
	//********************************

	public static int Main()
	{
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] a = {13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int w;
		int i;
		for (i = 1; i <= 11; i++)
		{
			a[i] = a[i - 1] + days[i - 1];
		}
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 11; i++)
		{
			if ((a[i] - 1 + w) % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

