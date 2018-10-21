package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String word = new String(new char[5000]);
	int i;
	int j;
	int l;
	int a;
	int[] len = new int[300];
	word = new Scanner(System.in).nextLine();
	l = word.length();
	j = 0;
	a = 0;
	for (i = 0;i < l;i++)
	{
	  if (word.charAt(i) != ' ')
	  {
		  len[j] += 1;
		  a = 0;
	  }
	  else
	  {
		  if (a == 0)
		  {
			  j++;
			  a = 1;
		  }
	  }
	}
	System.out.printf("%d",len[0]);
	for (i = 1;i <= j;i++)
	{
	   System.out.printf(",%d",len[i]);
	}

	return 0;
	}

}
