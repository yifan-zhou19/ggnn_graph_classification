public class shu
{
	public int num;
 public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  shu[] shu = tangible.Arrays.initializeWithDefaultshuInstances(999);
	  int n;
	  int i;
	  int j;
	  int k;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shu[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			shu[i].author = tempVar3.charAt(0);
		}
	  }
	  int[] a = new int[26];
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < 26;j++)
		{
		  if (shu[i].author.charAt(j) == 'A')
		  {
			  a[0] = a[0] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'B')
		  {
			  a[1] = a[1] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'C')
		  {
			  a[2] = a[2] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'D')
		  {
			  a[3] = a[3] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'E')
		  {
			  a[4] = a[4] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'F')
		  {
			  a[5] = a[5] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'G')
		  {
			  a[6] = a[6] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'H')
		  {
			  a[7] = a[7] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'I')
		  {
			  a[8] = a[8] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'J')
		  {
			  a[9] = a[9] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'K')
		  {
			  a[10] = a[10] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'L')
		  {
			  a[11] = a[11] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'M')
		  {
			  a[12] = a[12] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'N')
		  {
			  a[13] = a[13] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'O')
		  {
			  a[14] = a[14] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'P')
		  {
			  a[15] = a[15] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'Q')
		  {
			  a[16] = a[16] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'R')
		  {
			  a[17] = a[17] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'S')
		  {
			  a[18] = a[18] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'T')
		  {
			  a[19] = a[19] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'U')
		  {
			  a[20] = a[20] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'V')
		  {
			  a[21] = a[21] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'W')
		  {
			  a[22] = a[22] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'X')
		  {
			  a[23] = a[23] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'Y')
		  {
			  a[24] = a[24] + 1;
		  }
		  else if (shu[i].author.charAt(j) == 'Z')
		  {
			  a[25] = a[25] + 1;
		  }
		}
	  }
	  k = a[0],m = 0;
	  for (i = 0;i < 26;i++)
	  {
		if (k < a[i])
		{
		  k = a[i];
		  m = i;
		}
	  }
	  char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	  System.out.printf("%c\n",b[m]);
	  System.out.printf("%d\n",k);
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < 26;j++)
		{
		  if (shu[i].author.charAt(j) == b[m])
		  {
			System.out.printf("%d\n",shu[i].num);
			break;
		  }
		}
	  }
	}
}

