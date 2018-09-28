package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[500]);
		  int i;
		  int j;
		  int k;
		  int l;
		  int t;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  l = s.length();
		  for (i = 2;i <= l;i++)
		  {
			 for (j = 0;j <= l - i;j++)
			 {
				t = 1;
				for (k = j;k < j + i;k++)
				{
					if (s.charAt(k) != s.charAt(j + j + i - 1 - k))
					{
					   t = 0;
					   break;
					}
					if (t == 0)
					{
						break;
					}
				}
				if (t == 1)
				{
				   for (m = j;m < j + i;m++)
				   {
				   System.out.printf("%c",s.charAt(m));
				   }
				   System.out.print("\n");
				}
			 }
		  }
	}
}

