package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int l;
		String str = new String(new char[101]);
		char[][] a = new char[100][15];
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
			{
				a[j][k] = str.charAt(i);
				k++;
			}
			else
			{
				a[j][k] = '\0';
				k = 0;
				j++;
			}
		}
		a[j][k] = '\0';
		for (l = j;l >= 1;l--)
		{
			System.out.printf("%s ",a[l]);
		}
		System.out.printf("%s\n",a[0]);
	}

}
