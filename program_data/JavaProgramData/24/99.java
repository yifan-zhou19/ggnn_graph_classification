package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] b = new char[50][100];
	  int l;
	  int ma;
	  int max;
	  int mi;
	  int min;
	  int i = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  b[0] = tempVar.charAt(0);
	  }
	  ma = mi = String.valueOf(b[0]).length();
	  max = min = 0;


		while (scanf("%s",b[i]) == 1)
		{
			l = String.valueOf(b[i]).length();


			if (ma < l)
			{
				ma = l;
				max = i;
			}
			else if (l < mi)
			{
				mi = l;
				min = i;
			}
			i++;
		}
		System.out.printf("%s\n%s",b[max],b[min]);
	}
}

