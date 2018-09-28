package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String string = new String(new char[257]);
	   String substring = new String(new char[257]);
	   String replacement = new String(new char[257]);
	   String = new Scanner(System.in).nextLine();
	   substring = new Scanner(System.in).nextLine();
	   replacement = new Scanner(System.in).nextLine();
	   int i;
	   int len1;
	   int len2;
	   int j;
	   int k;
	   int a = 0;
	   len1 = String.length();
	   len2 = substring.length();
	   for (i = 0;i < len1;i++)
	   {
			if (String[i] == substring.charAt(0))
			{
				for (j = 1;j < len2;j++)
				{
					if (substring.charAt(j) == string.charAt(j + i))
					{
						a += 1;
					}
					else
					{
						break;
					}
				}
				if (a == len2 - 1)
				{
					for (k = 0;k < len2;k++)
					{
						String[k + i] = replacement.charAt(k);
					}
					break;
				}
			}
	   }
		System.out.println(String);



					return 0;

	}



}
