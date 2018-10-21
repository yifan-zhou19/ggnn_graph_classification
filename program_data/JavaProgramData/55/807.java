package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String S = new String(new char[N]);
		 String T = new String(new char[N]);
		 int a;
		 int n;
		 int b;
		 int S10 = 0;
		 int d = 1;
		 int l = 1;
		 int m = 1;
		 int[] num = new int[N];
		 int i;
		 int j;
		 int k;
		 int r;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 S = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }
		 t = S.length();
		 for (j = 0;j < t - 1;j++)
		 {
			  d = d * a;
		 }
		 for (i = 0;i < t;i++)
		 {
			  if (S.charAt(i) <= '9')
			  {
					 l = S.charAt(i) - '0';
					 S10 = S10 + l * d;
					 d = d / a;
			  }
			  if (S.charAt(i) > '9')
			  {
					 if (S.charAt(i) > 'a' - 1)
					 {
							 S = tangible.StringFunctions.changeCharacter(S, i, S.charAt(i) - 'a'+'A');
					 }
					 l = 10 + S.charAt(i) - 'A';
					 S10 = S10 + l * d;
					 d = d / a;
			  }
		 }
		 for (k = 0;;k++)
		 {
			  num[k] = S10 % b;
			  S10 = S10 / b;
			  if (S10 == 0)
			  {
					 break;
			  }
		 }
		 t = k;
		 for (r = 0;r <= t;r++,k--)
		 {
			  if (num[k] <= '9'-'0')
			  {
					  T = tangible.StringFunctions.changeCharacter(T, r, '0' + num[k]);
			  }
			  if (num[k] > '9'-'0')
			  {
					  T = tangible.StringFunctions.changeCharacter(T, r, 'A' + num[k] - 10);
			  }
		 }
		 T = tangible.StringFunctions.changeCharacter(T, r, '\0');
		 System.out.printf("%s",T);
	}
}

