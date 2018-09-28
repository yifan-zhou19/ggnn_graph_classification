package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String store = new String(new char[300]);
		  final String add1 = "";
		  final String add2 = "";
		  final String sum = "";
		  int i;
		  int l;
		  int j;
		  int l1;
		  int l2;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  store = tempVar.charAt(0);
		  }
		  l = store.length() - 1;
		  for (i = l;i >= 0;i--)
		  {
			  add1 = tangible.StringFunctions.changeCharacter(add1, l - i, store.charAt(i));
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  store = tempVar2.charAt(0);
		  }
		  l = store.length() - 1;
		  for (i = l;i >= 0;i--)
		  {
			  add2 = tangible.StringFunctions.changeCharacter(add2, l - i, store.charAt(i));
		  }

		  l1 = add1.length();
		  l2 = add2.length();
		  if (l1 > l2)
		  {
				for (i = l2;i <= l1;i++)
				{
					add2 = tangible.StringFunctions.changeCharacter(add2, i, '0');
				}
				add1 = tangible.StringFunctions.changeCharacter(add1, l1, '0');
		  }
		  else
		  {
			   for (i = l1;i <= l2;i++)
			   {
				   add1 = tangible.StringFunctions.changeCharacter(add1, i, '0');
			   }
			   add2 = tangible.StringFunctions.changeCharacter(add2, l2, '0');
		  }

		  for (i = 0; add1.charAt(i) != '\0' || add2.charAt(i) != '\0'; i++)
		  {
				j = (add1.charAt(i) - '0') + (add2.charAt(i) - '0');
				if (j >= 10)
				{
					add1 = tangible.StringFunctions.changeCharacter(add1, i + 1, add1.charAt(i + 1) + 1);
				}
				sum = tangible.StringFunctions.changeCharacter(sum, i, j % 10 + '0');
		  }

		  l = sum.length();
		  for (i = l - 1;i >= 0;i--)
		  {
			  if (sum.charAt(i) != '0' || i == 0)
			  {
				  break;
			  }
		  }
		  for (;i >= 0;i--)
		  {
			  System.out.printf("%c",sum.charAt(i));
		  }
		  return 0;
	}
}

