package <missing>;

public class GlobalMembers
{
	//itc online test nov 15
	public static int Main()
	{
		   String s = new String(new char[100]);
		   int a;
		   int b;
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
		   int slen = s.length();
		   int indec = 0;
		   int tempdec;
		   int i;
		   int j;
		   for (i = 0;i <= slen - 1;i++)
		   {
			   if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
			   {
									   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 48);
			   }
			   else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			   {
					  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 55);
			   }
			   else
			   {
					  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 87);
			   }
			   tempdec = 1;
			   for (j = 1;j <= slen - i - 1;j++)
			   {
					tempdec = tempdec * a;
			   }
			   indec = indec + tempdec * s.charAt(i);
		   }
		   String res = new String(new char[100]);
		   int temp;
		   int point = 0;
		   while (indec >= b)
		   {
				  temp = indec % b;
				  indec = indec / b;
				  if (temp < 10)
				  {
					   res = tangible.StringFunctions.changeCharacter(res, point, temp + 48);
				  }
				  else
				  {
						 res = tangible.StringFunctions.changeCharacter(res, point, temp + 55);
				  }
				  point++;
		   }
		   if (indec < 10)
		   {
						res = tangible.StringFunctions.changeCharacter(res, point, indec + 48);
		   }
		   else
		   {
				  res = tangible.StringFunctions.changeCharacter(res, point, indec + 55);
		   }
		   for (i = point;i >= 0;i--)
		   {
			   System.out.printf("%c",res.charAt(i));
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   i = Integer.parseInt(tempVar4);
		   }
	}




}

