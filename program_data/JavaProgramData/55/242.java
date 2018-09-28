package <missing>;

public class GlobalMembers
{
	public static void zhuanhuan(String a)
	{
	 char t;
	 int i;
	 int length;
	 length = a.length();
	 for (i = 0;i < length / 2;i++)
	 {
	  t = a[i];
	  a[i] = a[length - i - 1];
	  a[length - i - 1] = t;
	 }
	}

	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i=0;
	 int i = 0;
	 int sum = 0;
	 int a;
	 int b;
	 String num_1 = new String(new char[100]);
	 String num_2 = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 num_1 = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }

	 while (num_1.charAt(i) != '\0')
	 {
	  if (num_1.charAt(i) >= '0' && num_1.charAt(i) <= '9')
	  {
	   sum = sum * a + num_1.charAt(i) - '0';
	  }
	  else if (num_1.charAt(i) >= 'A' && num_1.charAt(i) <= 'Z')
	  {
	   sum = sum * a + num_1.charAt(i) - 'A' + 10;
	  }
	  else if (num_1.charAt(i) >= 'a' && num_1.charAt(i) <= 'z')
	  {
	   sum = sum * a + num_1.charAt(i) - 'a' + 10;
	  }
	  i++;
	 }

	 i = 0;
	 while (sum / b != 0)
	 {
	  int yu = sum % b;
	  if (yu >= 0 && yu <= 9)
	  {
		  num_2 = tangible.StringFunctions.changeCharacter(num_2, i, '0' + yu);
	  }
	  else if (yu >= 10)
	  {
		  num_2 = tangible.StringFunctions.changeCharacter(num_2, i, 'A' + yu - 10);
	  }
	  sum = sum / b;

	  i++;

	 }

	 if (sum >= 0 && sum <= 9)
	 {
		 num_2 = tangible.StringFunctions.changeCharacter(num_2, i, '0' + sum);
	 }
	 if (sum >= 10)
	 {
		 num_2 = tangible.StringFunctions.changeCharacter(num_2, i, 'A' + sum - 10);
	 }

	num_2 = tangible.StringFunctions.changeCharacter(num_2, i + 1, '\0');
	 zhuanhuan(num_2);

	 if (num_2.charAt(0) != 0)
	 {
		 System.out.println(num_2);
	 }
	 else
	 {
		 for (i = 1;i < num_2.length() - 1;i++)
		 {
			 System.out.printf("%c",num_2.charAt(i));
		 }
	 }

	}
}

