package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int d;
	  int b;
	  int s;
	  int[] a = new int[10000];
	  String c = new String(new char[10000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  d = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  //d=15;
	  //b=7;
	  s = 0;
	  if (c.charAt(0) - '0' == 0)
	  {
		  System.out.print("0");
	  }
	  else
	  {
		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
		  if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
		  {
			  c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
		  }
		  if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
		  {
			  a[i] = c.charAt(i) - 55;
		  }
		  //if(c[i]>='A'&&c[i]<='Z'){a[i]=c[i]-'0'+10;printf("%d\n",a[i]);}
		  else
		  {
			  a[i] = c.charAt(i) - '0';
		  }
		  //printf("%d\n",a[i]);                   
		  }
	  //printf("%d\n",i);
	  for (j = 0;j < i;j++)
	  {
	   s = d * s + a[j];

	  }
	  for (i = 0;s != 0;i++)
	  {
		 a[i] = s % b;
		 s = s / b;

	   // printf("%d\n",a[i]); 
		 if (a[i] >= 10)
		 {
		   c = tangible.StringFunctions.changeCharacter(c, i, 'A' + a[i] - 10);
		 }
		 else
		 {
			 c = tangible.StringFunctions.changeCharacter(c, i, a[i] + '0');
		 }
		 // printf("%c\n",c[i]);
		   //printf("%d\n",i);            
	  }

	  for (j = i - 1;j >= 0;j--)
	  {
	   System.out.printf("%c",c.charAt(j));
	  }
	  }
	System.in.read();
	System.in.read();
	 System.in.read();
	}
}

