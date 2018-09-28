BEGIN {
}
/^\?/ {
   n = asorti(edges, se)
   for (i=1; i<=n; i++) {
     k = split(se[i], a)
     printf("%s %s %s\n", a[2], a[1], a[3])
   }
   print $0
   printf("\n")
   delete edges
}
! /^\?/ && /^[0-9]/ {
   s = sprintf("%1d %3d %3d", $2, $1, $3)
   edges[s] = 1
}
END {
   n = asorti(edges, se)
   for (i=1; i<=n; i++) {
     k = split(/ /, a, se[i])
     printf("%d %d %d\n", a[2], a[1], a[3])
   }
}
