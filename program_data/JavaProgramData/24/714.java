package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 char[][] word =
			 {
				 {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
			 };
			 String max = new String(new char[100]);
			 String min = new String(new char[100]);
		int[] len = new int[50];
		int n;
		int da = 0;
		int xiao = 100;
		for (int i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
					  len[i] = String.valueOf(word[i]).length();
					  n = i;
					  if (len[i] == 0)
					  {
						  break;
					  }
		}
			 for (int j = 0;j < n;j++)
			 {
					  if (len[j] < xiao)
					  {
						   xiao = len[j];
						   min = word[j];
					  }
					  if (len[j] > da)
					  {
						   da = len[j];
						   max = word[j];
					  }
			 }
			 System.out.printf("%s\n",max);
			 System.out.printf("%s\n",min);
			  return 0;
	}

}

