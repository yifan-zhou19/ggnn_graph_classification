package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int compare = new int(char str1[80],char str2[80]);
		int k = 0;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		k = compare(str1, str2);
		if (k == 0)
		{
			System.out.print("=\n");
		}
		else if (k == 1)
		{
			System.out.print(">\n");
		}
		else if (k == -1)
		{
			System.out.print("<\n");
		}
	}
	public static int compare(String str1, String str2)
	{
		int i;
		int m;
		for (i = 0;i < 80;i++)
		{
		if (!str1[i].equals('\0') && !str2[i].equals('\0'))
		{
			if (str1[i].equals(str2[i]) || (str1[i].equals(str2[i].Substring(32)) || str1[i].equals(str2[i] - 32)))
			{
				continue;
			}
			else if (!str1[i].equals(str2[i].Substring(32)) || !str1[i].equals(str2[i] - 32))
			{
				if (str1[i].compareTo('Z') <= 0 && str2[i].compareTo('Z') <= 0 || str1[i].compareTo('a') >= 0 && str2[i].compareTo('a') >= 0)
				{
					 if (str1[i].compareTo(str2[i]) > 0)
					 {
						 m = 1;
						 break;
					 }
					 else
					 {
						 m = -1;
						 break;
					 }
				}
				 else if (str1[i].compareTo('Z') <= 0 && str2[i].compareTo('a') >= 0)
				 {
					 if (str1[i].compareTo(str2[i] - 32) > 0)
					 {
						 m = 1;
						 break;
					 }
					 else
					 {
						 m = -1;
						 break;
					 }
				 }
				 else if (str1[i].compareTo('a') >= 0 && str2[i].compareTo('Z') <= 0)
				 {
					 if (str1[i].compareTo(str2[i].Substring(32)) > 0)
					 {
						 m = 1;
						 break;
					 }
					 else
					 {
						 m = -1;
						 break;
					 }
				 }
			}

		}
		if (str1[i].equals('\0') && str2[i].equals('\0'))
		{
			m = 0;
			break;
		}
		else
		{
			continue;
		}
		}
		return m;
	}

}
