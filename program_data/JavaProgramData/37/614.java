package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int num;
		int i;
		int j;
		int n;
		int flag = 0;
		String str = new String(new char[100001]);
		int[] check = new int[26];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (count = 1; count <= num; count++)
		{
			 flag = 0;
			 int[] check = new int[26];
			 str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 n = str.length();
			 for (i = 0; i < n; i++)
			 {
				 check[str.charAt(i) - 'a']++;
			 }
			 for (i = 0; i < n; i++)
			 {
				 if (check[str.charAt(i) - 'a'] == 1)
				 {
					 System.out.print(str.charAt(i));
					 System.out.print("\n");
					 flag = 1;
				 }
				 if (flag != 0)
				 {
				 break;
				 }
			 }
				 if (flag == 0)
				 {
				 System.out.print("no");
				 System.out.print("\n");
				 }
		}
		return 0;
	}
}

