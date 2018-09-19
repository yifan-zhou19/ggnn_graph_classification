package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int temp = 0;
		int j = 0;
		int len;
		int[] a = new int[1000];
		int temp2;
		String str = new String(new char[1000]);
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		char[][] name = new char[1000][101];
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i <= len;i++)
		{
		   if (str.charAt(i) != ' ')
		   {
			 name[temp][j] = str.charAt(i);
			 j++;
		   }

		   if (str.charAt(i) == ' ')
		   {
			  a[temp] = j;
			  temp++;
			  j = 0;
		   }
		}
		for (j = 0 ;j < temp ;j++)
		{
			if (strcmp(str1,name[j]) == 0)
			{
			System.out.print(str2);
			System.out.print(" ");
			}
		 else
		 {
		 System.out.print(name[j]);
		 System.out.print(" ");
		 }
		}
		 if (strcmp(str1,name[temp]) == 0)
		 {
		 System.out.print(str2);
		 }
		 if (strcmp(str1,name[temp]) != 0)
		 {
		 System.out.print(name[temp]);
		 }
	}

}
