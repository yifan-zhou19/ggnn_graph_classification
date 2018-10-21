package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int l;
		  int k;
		  int i;
		  int j;
		  int ten;
		  int goal;
		  int t;
		  String s = new String(new char[1000]);
		  char s3;
		  int[] s2 = new int[1000];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  ten = 0;
		  goal = 0;
		  l = s.length();
		  l--;
		  k = 1;
		  for (i = l;i >= 0;i--)
		  {
			  if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			  {
				   ten += (s.charAt(i) - '0') * k;
			  }
			  else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			  {
				   ten += (s.charAt(i) - 'a' + 10) * k;
			  }
			  else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			  {
				   ten += (s.charAt(i) - 'A' + 10) * k;
			  }

			  k *= a;
		  }
		  t = 0;
		  if (ten == 0)
		  {
			  System.out.printf("%d",ten);
		  }
		  while (ten > 0)
		  {

				k = ten % b;
				s2[t] = k;
				ten = ten / b;
				t++;
		  }
		  t--;
		  for (i = t;i >= 0;i--)
		  {
			  if (s2[i] < 10)
			  {
				  System.out.printf("%d",s2[i]);
			  }
			  else
			  {
				  s3 = s2[i] - 10 + 'A';
				  System.out.printf("%c",s3);
			  }
		  }

		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

