package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int n;
		 int b;
		 int s;
		 int i;
		 int j;
		 int k;
		 int l;
		 int[] sz = new int[100];
		 int[] zh = new int[100];
		 String zf = new String(new char[100]);
		 String tj = new String(new char[100]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 zf = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }
		 l = zf.length();
		 for (i = 0;i < l;i++)
		 {
			 if (zf.charAt(i) >= '0' && zf.charAt(i) <= '9')
			 {
				sz[i] = zf.charAt(i) - '0';
			 }
			else if (zf.charAt(i) >= 'a' && zf.charAt(i) <= 'z')
			{
				sz[i] = zf.charAt(i) - 'a' + 10;
			}
			else if (zf.charAt(i) >= 'A' && zf.charAt(i) <= 'z')
			{
				sz[i] = zf.charAt(i) - 'A' + 10;
			}
		 }
		 s = 0;
		 for (i = 0;i < l;i++)
		 {
			s = s * a + sz[i];
		 }
		 j = 0;
		 if (s == 0)
		 {
			 zh[j] = 0;
			 j++;
		 }
		 else
		 {
			 while (s > 0)
			 {
				zh[j] = s % b;
				s = s / b;
				j++;
			 }
		 }
		  for (k = 0;k < j;k++)
		  {
			if (zh[k] > 9)
			{
				tj = tangible.StringFunctions.changeCharacter(tj, k, 'A' + zh[k] - 10);
			}
			else
			{
				tj = tangible.StringFunctions.changeCharacter(tj, k, zh[k] + '0');
			}
		  }
		 for (k = j - 1;k >= 0;k--)
		 {
			System.out.printf("%c",tj.charAt(k));
		 }
		 return 0;
	}


}

