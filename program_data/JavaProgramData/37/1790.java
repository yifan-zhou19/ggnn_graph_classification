package <missing>;

public class GlobalMembers
{
	public static String in = new String(new char[100000]);
	public static int Main()
	{

		  int t;
		  int k;
		  int i;
		  int j;
		  int m;
		  int[] num = new int[26];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (k = 1;k <= t;k++)
		  {
			   m = 0;
			   for (i = 0;i <= 25;i++)
			   {
				   num[i] = 0;
			   }
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   in = tempVar2.charAt(0);
			   }
			   for (i = 0;in.charAt(i) != '\0';i++)
			   {
					j = in.charAt(i) - 97;
					num[j]++;
			   }
			   for (i = 0;in.charAt(i) != '\0';i++)
			   {
				   if (num[in.charAt(i) - 97] == 1)
				   {
					   System.out.printf("%c\n",in.charAt(i));
					   m = 1;
					   break;
				   }
			   }
			   if (m == 0)
			   {
				   System.out.print("no\n");
			   }

		  }

	}
}

