package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String zfc = new String(new char[30000]);
	  int i;
	  int len;
	  int[] length = new int[301];
	  int t = 0;
	  int k;
	  zfc = new Scanner(System.in).nextLine();
	  len = zfc.length();
	  for (i = 0;i < len;i++)
	  {
		  if (zfc.charAt(i) == ' ')
		  {
			  for (k = i + 1;;k++)
			  {
				  if (zfc.charAt(k) == ' ')
				  {
					  continue;
				  }
				  else
				  {
					  t++;
					  i = k;
					  break;
				  }
			  }
		  }
		  length[t]++;
	  }
	  for (i = 0;i <= t;i++)
	  {
		  if (i == 0)
		  {
			   System.out.printf("%d",length[0]);
		  }
		  else
		  {
			  System.out.printf(",%d",length[i]);
		  }
	  }
	  return 0;
	}









}
