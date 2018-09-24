package <missing>;

public class GlobalMembers
{
	public static void fun(String data)
	{
		 int[] freq = new int[26];
		 int i;
		 for (i = 0; i <= 25; i++)
		 {
			   freq[i] = 0;
		 }

		 int len = data.length();

		 for (i = 0; i <= len - 1; i++)
		 {
			   freq[data[i] - 'a'] = (freq + data[i] - 'a') + 1;
		 }

		 int count = 0;
		 for (i = 0; i <= len - 1; i++)
		 {
			   if (freq[data[i] - 'a'] == 1)
			   {
						 System.out.printf("%c\n", data[i]);
						 count = 1;
						 break;
			   }
		 }
		 if (count == 0)
		 {
		 System.out.print("no\n");
		 }
	}




	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		String data = new String(new char[100001]);
		for (i = 1; i <= n; i++)
		{
			  data = new Scanner(System.in).nextLine();
			  fun(data);
		}

		return 0;
	}


}

