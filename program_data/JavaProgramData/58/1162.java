package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s1 = new String(new char[100]);
	  int i;
	  int j;
	  int n;
	  int len;
	  int[] s2 = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.in.read();
	  for (i = 0;i < n;i++)
	  {
		 //scanf("%s",s1);
		 //getchar();
		 s1 = new Scanner(System.in).nextLine();
		 len = s1.length();
		 for (j = 0;j < len;j++)
		 {
			if (j == 0)
			{
			  if (!((s1.charAt(j) >= 'a' && s1.charAt(j) <= 'z') || (s1.charAt(j) == '_') || (s1.charAt(j) >= 'A' && s1.charAt(j) <= 'Z')))
			  {
				s2[i] = 0; //printf("0\n");
				break;
			  }
			}
			else
			{
			  if (!((s1.charAt(j) >= 'a' && s1.charAt(j) <= 'z') || (s1.charAt(j) == '_') || (s1.charAt(j) >= 'A' && s1.charAt(j) <= 'Z') || (s1.charAt(j) >= '0' && s1.charAt(j) <= '9')))
			  {
				 s2[i] = 0;
				 break;
			  }
			}
		 }
		 if (j >= len)
		 {
			  s2[i] = 1;
		 }
	  }
	  for (i = 0;i < n;i++)
	  {
		 System.out.printf("%d\n",s2[i]);
	  }
	  return 0;
	}

}

