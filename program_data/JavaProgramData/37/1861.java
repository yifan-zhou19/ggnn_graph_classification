package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < t;i++)
		{
		 String a = new String(new char[100000]);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 int len = a.length();
		 int count = 0;
		 int[] sum = new int[100000];
		 for (int j = 0;j < len;j++)
		 {
		 for (int k = 0;k < len;k++)
		 {
		 if (a.charAt(k) == a.charAt(j))
		 {
		 sum[j]++;
		 }
		 }
		 if (sum[j] == 1)
		 {
		  System.out.printf("%c\n",a.charAt(j));
		  count++;
		  break;
		 }
		 }
		 if (count == 0)
		 {
		 System.out.print("no\n");
		 }
		}
	}
}

