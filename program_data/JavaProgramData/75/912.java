package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x1 = new String(new char[10000]);
		String y1 = new String(new char[10000]);
		for (int s = 0; s < 10000; s++)
		{
			x1 = tangible.StringFunctions.changeCharacter(x1, s, '\0');
			y1 = tangible.StringFunctions.changeCharacter(y1, s, '\0');
		}
		int num = 0;
		int i;
		int j;
		int k = 0;
		int max = 1;
		int[] flag = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		x1 = new Scanner(System.in).nextLine();
		y1 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * px = x1;
		String py = y1;
		while (*px != '\0')
		{
			x[num] = Double.parseDouble(px);
			num++;
			px++;
			while (*px != ',' && *px != '\0')
			{
				px++;
			}
			px++;
		}
		while (py != '\0')
		{
			y[k] = Double.parseDouble(py);
			k++;
			py = py.Substring(1);
			while (py != ',' && py != '\0')
			{
				py = py.Substring(1);
			}
			py = py.Substring(1);
		}

		for (i = 0; i < num; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				flag[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (flag[i] > max)
			{
				max = flag[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		/*if((num == 200) && (max == 103))
		{
			cout<<x1<<endl;
			cout<<y1<<endl;
		}*/
		return 0;
	}
}

