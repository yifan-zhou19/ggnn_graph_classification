package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		String b = new String(new char[5000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = 1;
		for (int l = 0; a.charAt(l) != '\0'; l++)
		{
			if (a.charAt(l) == ',')
			{
				n++;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		char[][] come = new char[2500][4];
		char[][] go = new char[2500][4];
		int i = 0;
		int j = 0;
		int k = 0;
		for (; i < a.length(); i++)
		{
			if (a.charAt(i) != ',')
			{
				come[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				come[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		come[j][k] = '\0';
		i = 0, j = 0, k = 0;
		for (; i < b.length(); i++)
		{
			if (b.charAt(i) != ',')
			{
				go[j][k] = b.charAt(i);
				k++;
			}
			else
			{
				go[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		go[j][k] = '\0';
		int[] come1 = new int[2500];
		int[] go1 = new int[2500];
		for (i = 0; i < n; i++)
		{
			come1[i] = Integer.parseInt(come[i]);
			go1[i] = Integer.parseInt(go[i]);
		}
		int max = 0;
		int peo = 0;
		for (int time = 1; time < 1000; time++)
		{
			for (int num = 0; num < n; num++)
			{
				if (come1[num] <= time != 0 && time < go1[num])
				{
					peo++;
				}
			}
			if (peo > max)
			{
				max = peo;
			}
			peo = 0;
		}
		System.out.print(max);
		System.out.print("\n");
	}
}

