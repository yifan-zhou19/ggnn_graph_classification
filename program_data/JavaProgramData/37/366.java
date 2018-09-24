package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int t;
	   int i;
	   int l;
	   int j;
	   String string = new String(new char[100000]);
	   int[] count = new int[26];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (int m = 0;m < t;m++)
	   {
		  int[] count = new int[26];
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  String = tempVar2;
		  }
		  l = String.length();
		  for (j = 0;j < l;j++)
		  {
			 for (i = 0;i < 26;i++)
			 {
				if (String[j] == i + 'a')
				{
				   count[i]++;
				}
			 }
		  }
		  for (j = 0;j < l;j++)
		  {
			  if (count[string.charAt(j) - 'a'] == 1)
			  {
				System.out.printf("%c\n",string.charAt(j));
				break;
			  }
		  }
		  if (j == l)
		  {
			System.out.print("no\n");
		  }
	   }
	   System.in.read();
	   System.in.read();
	}
}

