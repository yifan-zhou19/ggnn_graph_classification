package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int[] a = new int[1000];
		  int x;
		  String s = new String(new char[1001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  x = s.length();
		  for (i = 0;i < 1000;i++)
		  {
		  a[i] = 1;
		  }
		  for (i = 1;i <= x;i++)
		  {
						  if ((s.charAt(i) - 'A') == (s.charAt(i - 1) - 'A' - 32))
						  {
						  a[s.charAt(i) - 'A']++;
						  }
						  else if ((s.charAt(i) - 'A' - 32) == (s.charAt(i - 1) - 'A'))
						  {
						  a[s.charAt(i) - 'A' - 32]++;
						  }
						  else if ((s.charAt(i) - '0') == (s.charAt(i - 1) - '0'))
						  {
							   if ((s.charAt(i) - '0') < 43)
							   {
							   a[s.charAt(i) - 'A']++;
							   }
							   else
							   {
							   a[s.charAt(i) - 'A' - 32]++;
							   }
						  }

						  else
						  {
							  if ((s.charAt(i - 1) - '0') < 43)
							  {
							  System.out.printf("(%c,%d)",s.charAt(i - 1),a[s.charAt(i - 1) - 'A']);
							  a[s.charAt(i - 1) - 'A'] = 1;
							  }
							  else
							  {
							  System.out.printf("(%c,%d)",s.charAt(i - 1) - 'A' - 32 + 'A',a[s.charAt(i - 1) - 'A' - 32]);
							  a[s.charAt(i - 1) - 'A' - 32] = 1;
							  }
						  }
		  }


	}
}

