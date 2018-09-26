package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String S = new String(new char[N]);
		  int i;
		  int j;
		  int count = 0;
		  int k;
		  int[] l = new int[n];
		  S = new Scanner(System.in).nextLine();
		  for (i = 0,j = 0;;i++)
		  {
						  if (S.charAt(i) != ' ' && S.charAt(i) != '\0')
						  {
						  count++;
						  }
						  else
						  {
							  if (count != 0)
							  {
										  l[j] = count;
							  }
							  if (j != 0 && count != 0)
							  {
									  System.out.print(",");
							  }
							  if (count != 0)
							  {
									  System.out.printf("%d",l[j]);
									  j++;
									  count = 0;
							  }
						  }
						  if (S.charAt(i) == '\0')
						  {
						  break;
						  }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}
