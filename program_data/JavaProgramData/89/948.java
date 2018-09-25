package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????                   **
	//*??? 1100012927              **
	//*2011.11.29                     **
	//****************************************

	public static int Main()
	{
		int n;
		int per1 = 1;
		int per2 = 1;
		int[] knows = new int[10000];
		int[] knowed = new int[10000];
		int count = 0;
		int i = 0;
		int[] p = knows;
		int[] q = knowed;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			per1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			per2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (per1 != 0 || per2 != 0)
			{
				p[per1] = 1;
				(q[per2])++;
			}
			else
			{
				break;
			}
		}while (1 != 0);
		for (i = 0; i < n; i++)
		{
			if (p[i] == 0 && q[i] == n - 1)
			{
				if (count == 0)
				{
					System.out.print(i);
					count++;
				}
				else
				{
					System.out.print(' ');
					System.out.print(i);
					count++;
				}
			}
		}
		if (count == 0)
		{
			System.out.print("NOT FOUND");
		}
			 return 0;

	}
}

