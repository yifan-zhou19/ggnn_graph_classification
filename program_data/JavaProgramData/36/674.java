package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[1000]);
	  String b = new String(new char[1000]);
	  int[] num = new int[130];
	  int is = 1;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		  num[a.charAt(i)]++;
	  }
	  for (i = 0;b.charAt(i) != '\0';i++)
	  {
		  num[b.charAt(i)]--;
	  }
	  for (i = 1;i < 130;i++)
	  {
		  if (num[i] != 0)
		  {
		  is = 0;
		  break;
		  }
	  }
	  if (is != 0)
	  {
		  System.out.print("YES\n");
	  }
	  else
	  {
		  System.out.print("NO\n");
	  }
	  return 0;
	}

}

