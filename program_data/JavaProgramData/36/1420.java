package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[128];
		  int[] b = new int[128];
		  int i;
		  int j = 0;
		  for (i = 0;i < 128;i++)
		  {
				a[i] = 0;
				b[i] = 0;
		  }

		  String str_1 = new String(new char[1000]);
		  String str_2 = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str_1 = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  str_2 = tempVar2.charAt(0);
		  }

		  for (i = 0;i <= str_1.length();i++)
		  {
				a[(int)str_1.charAt(i)]++;
		  }
		  for (i = 0;i <= str_2.length();i++)
		  {
				b[(int)str_2.charAt(i)]++;
		  }

		  for (i = 0;i < 128;i++)
		  {
				if (a[i] == b[i])
				{
						j++;
				}
		  }

		  if (j == 128)
		  {
			   System.out.print("YES");
		  }
		  else
		  {
			  System.out.print("NO");
		  }
	}

}

