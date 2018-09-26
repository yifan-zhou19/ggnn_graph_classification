package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int num1 = 0;
		int num2 = 100;
		int[] age = new int[100];
		int[] flag = new int[100];
		char[][] id = new char[100][10];
		String str = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			System.in.read();
			id[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			age[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (age[i] < 60)
			{
				flag[i] = num1++;
			}
			else
			{
				flag[i] = num2++;
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (age[i] < age[j] && age[j] >= 60)
				{
					temp = flag[i];
					flag[i] = flag[j];
					flag[j] = temp;
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
					str = id[i];
					id[i] = id[j];
					id[j] = str;
				}
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (age[i] == age[j] && age[i] >= 60 && age[j] >= 60 && flag[i] > flag[j] || age[i] < 60 && age[j] < 60 && flag[i] > flag[j])
				{
					temp = flag[i];
					flag[i] = flag[j];
					flag[j] = temp;
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
					str = id[i];
					id[i] = id[j];
					id[j] = str;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(id[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

