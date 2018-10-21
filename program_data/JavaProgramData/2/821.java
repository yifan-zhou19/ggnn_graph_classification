public class information
{
	public int a;
	public String s = new String(new char[26]);
	public int len;
}

package <missing>;

public class GlobalMembers
{
	public static information[] xinxi = tangible.Arrays.initializeWithDefaultinformationInstances(1000);


	public static void Main()
	{
		int n;
		int i;
		int[] c = new int[26];
		int max;
		int t;
		int j;

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
				xinxi[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				xinxi[i].s = tempVar3.charAt(0);
			}
			xinxi[i].len = String.valueOf(xinxi[i].s).length();
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < xinxi[i].len;j++)
		  {
			  if (xinxi[i].s.charAt(j) == 'A')
			  {
				  c[1]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'B')
			  {
				  c[2]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'C')
			  {
				  c[3]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'D')
			  {
				  c[4]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'E')
			  {
				  c[5]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'F')
			  {
				  c[6]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'G')
			  {
				  c[7]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'H')
			  {
				  c[8]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'I')
			  {
				  c[9]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'J')
			  {
				  c[10]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'K')
			  {
				  c[11]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'L')
			  {
				  c[12]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'M')
			  {
				  c[13]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'N')
			  {
				  c[14]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'O')
			  {
				  c[15]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'P')
			  {
				  c[16]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'Q')
			  {
				  c[17]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'R')
			  {
				  c[18]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'S')
			  {
				  c[19]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'T')
			  {
				  c[20]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'U')
			  {
				  c[21]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'V')
			  {
				  c[22]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'W')
			  {
				  c[23]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'X')
			  {
				  c[24]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'Y')
			  {
				  c[25]++;
			  }
			  if (xinxi[i].s.charAt(j) == 'Z')
			  {
				  c[26]++;
			  }
		  }
		}
		  max = c[0];
		  t = 0;
		for (i = 1;i < 26;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
				t = i;
			}
		}
		System.out.printf("%c\n",64 + t);
		System.out.printf("%d\n",c[t]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < xinxi[i].len;j++)
			{
				if (xinxi[i].s.charAt(j) == 64 + t)
				{
					System.out.printf("%d\n",xinxi[i].a);
				}
			}
		}
	}

}

