package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[6000]);
		char[][] a = new char[200][30];
		String max = new String(new char[30]);
		String min = new String(new char[30]);
		int i;
		int j = 0;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == ',')
			{
				a[j][k] = 0;
				j++;
				k = 0;
			}
			else
			{
				a[j][k] = str.charAt(i);
				k++;
			}
		}
		a[j][k] = 0;
		max = a[0];
		for (i = 1;i < j + 1;i++)
		{
			if (String.valueOf(a[i]).length() > max.length())
			{
				max = a[i];
			}
		}
		min = a[0];
		for (i = 1;i < j + 1;i++)
		{
			if (String.valueOf(a[i]).length() < min.length() && String.valueOf(a[i]).length() >= 1)
			{
				min = a[i];
			}
		}
		System.out.printf("%s\n%s\n",max,min);
		return 0;
	}



}
