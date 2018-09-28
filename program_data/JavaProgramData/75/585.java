package <missing>;

public class GlobalMembers
{
	//********************
	//***
	//**??? 1300012728* 
	//**2013.10.30********
	//********************
	public static int Main()
	{
		int[] time = new int[1000]; // ???????
		for (int i = 0; i < 1000; i++)
		{
		time[i] = 0;
		}
		int[] begin = new int[1001]; // ??????????????
		int[] end = new int[1001];
		int n = 1; // ?????n
		char point; // ??point??�?�
		while ((begin[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) // ????begin??
		{
			cin.get(point);
			if (point != ',') // ????�?�??????????
			{
				break;
			}
			n++; // ???+1
		}
		for (int i = 1; i <= n; i++)
		{
				end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.in.read();
		}

		for (int i = 1; i <= n; i++)
		{
			 for (int j = begin[i]; j < end[i]; j++)
			 {
				 time[j] += 1;
			 }
		}
		int max = 0;
		for (int i = 1; i < 1000; i++)
		{
			if (max <= time[i])
			{
				max = time[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

