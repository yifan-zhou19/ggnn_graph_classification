package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String st = new String(new char[50]);
		  String sub = new String(new char[30]);
		  int i;
		  int j;
		  int k;
		  int key;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  sub = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  st = tempVar2.charAt(0);
		  }
				key = 0;
		  for (i = 0;st.charAt(i) != '\0';i++)
		  {
			  for (j = i, k = 0;sub.charAt(k) != '\0' && st.charAt(j) == sub.charAt(k);j++, k++)
			  {
				  ;
			  }
			  if (sub.charAt(k) == '\0')
			  {
							  System.out.printf("%d",i);
			  key = 1;
			  break;
			  }

		  }
			  return 0;
	}

}

