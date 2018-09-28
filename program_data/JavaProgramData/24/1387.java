package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[300 * 100]);
	  int i;
	  int j;
	  int[] t = new int[100];
	  int[] c = new int[100];
	  int w;
	  int f;
	  int g;
	  int h;
	  int k;
	  w = 0;
	  str = new Scanner(System.in).nextLine();
	  for (i = 0;str.charAt(i) != 0 && str.charAt(i) != ' ';i++)
	  {
		 for (j = i + 1;str.charAt(j) != 0 && str.charAt(j) != ' ';j++)
		 {
			 ;
		 }
										t[w] = i;
										c[w] = j - i;
										i = j;
										w++; //????w???????????????????i<w,??i<=w?????
	  }
										f = c[0];
										g = 0;
										for (i = 0;i < w;i++)
										{
							   if (c[i] > f)
							   {
											 f = c[i];
											 g = i;
							   }
										}
										  h = c[0];
										  k = 0;
								  for (i = 0;i < w;i++)
								  {
								  if (c[i] < h)
								  {
							   h = c[i];
							   k = i;
								  }
								  }
						for (i = t[g];i < t[g] + c[g] - 1;i++)
						{
														System.out.printf("%c",str.charAt(i));
						}
														System.out.printf("%c\n",str.charAt(t[g] + c[g] - 1));
						for (i = t[k];str.charAt(i) != 0 && str.charAt(i) != ' ';i++)
						{
														System.out.printf("%c",str.charAt(i));
						}

	  return 0;
	}

}
