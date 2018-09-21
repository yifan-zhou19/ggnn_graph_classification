package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		char c;
		String string = new String(new char[200]);
		String st = new String(new char[100]);
		int[] a = new int[500];
		int i;
		int j;
		int n;
		int d;
		int sum;
		int k;
		int x;
		int y;
		str = new Scanner(System.in).nextLine();
		n = 0;
		i = 0;
		for (i = 0;i < 50;i++)
		{
			a[i] = 0;
		}
	 for (i = 0;(c = str.charAt(i)) != '\0';i++)
	 {
			if ((c = str.charAt(i)) != ' ')
			{
			a[n] = a[n] + 1;
			}
			else
			{
				n++;
			}
	 }
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((c = str.charAt(i)) != '\0')
		{
			;
		}
		d = a[0];
		for (i = 0;i <= n;i++)
		{
		if (d < a[i])
		{
			d = a[i];
		j = i;
		}
		}
		sum = 0;
		if (j != 0)
		{
		k = 0;
		for (i = 0;i < j;i++)
		{
			if (a[i] == 0)
			{
				sum = sum + 1;
				k++;
			}
			else
			{
			sum = sum + a[i];
			}
		}
	 sum = sum + j - k;
		}

	   for (i = sum;i <= sum + d;i++)
	   {
		 String [i - sum] = str.charAt(i);
	   }
	 String[d] = '\0';
	 System.out.println(String);

	y = 0;
	for (i = 1;i < d;i++)
	{
		for (j = 0;j <= n;j++)
		{
			if (a[j] == i)
			{
				x = j;
				y = i;
				break;
			}
		}
			if (y != 0)
			{
				break;
			}
	}
	 sum = 0;
	if (x != 0)
	{
		k = 0;
		for (i = 0;i < x;i++)
		{
			if (a[i] == 0)
			{
				sum = sum + 1;
				k++;
			}
			else
			{
			sum = sum + a[i];
			}
		}
	 sum = sum + x - k;
	}
	 for (i = sum;i <= sum + y;i++)
	 {
		 st [i - sum] = str.charAt(i);
	 }
	 st = tangible.StringFunctions.changeCharacter(st, y, '\0');
	 System.out.println(st);

	}



}

